(function(factory) {
	if (typeof define === "function" && define.amd) {
		// AMD. Register as an anonymous module.
		define([], factory);
	} else {
		factory();
	}
}(function() {
	// code
	var select_gift = $('#select-gift'); //折扣大的box
	var input = $('#investInput'); //输入金额框
	var redPacket = $("#CouponRecordID"); //提交类型
	//var UseCoupon = $('#UseCoupon'); //是否使用
	var invest_earnings = $('#invest-earnings'); //预计收益
	var invest_attach = $('#invest-earnings-attachIncome');
	var invest_text = $('#invest-earnings-text');
	var income = invest_earnings.data('income');
	var submitBtn = $("#submit-invest");
	//text 状态
	var redPacket_status = $("#select-red_packet-status");
	var redPacket_money = $("#select-red_packet-money");
	var redPacket_type = $('#select-red_packet-type');
	//移动端
	var isMoblie = !!$('#manage_details').length;
	var notSubmit = true;
	var isNew= input.data('new');//是否新手
	
	//	初始化
	redPacket.data('status', true);

	//ui层面交互
	$(document).on("click", '#btn-manage:not(".disabled"),.mask', function(e) {
		$("#manage_details").toggleClass("js-is-active");
		select_gift.removeClass('js-is-active');
		e.preventDefault();
	})


	//交互功能:显示隐藏 
	$(document).on('click', '.select-red_packet', function(e) {
		select_gift.toggleClass('js-is-active');
	});

	$(document).on('click', '.select-gift-head_ok', function() {
		select_gift.removeClass('js-is-active');
		setTimeout(computeEarnings, 0);
	});

	//大部分逻辑
	$(document).on('click', '.select-gift-item:not(".disabled")', function() {
		var $this = $(this);
		var data = $this.data();

		//var value        = $this.data('value');
		//var text         = $this.data('text');
		//var ratehikeamount  = $this.data('ratehikeamount');
		//var min          = $this.data('min');
		//var type         = $this.data('type');
		//var couponamount = $this.data('couponamount');

		var bool = $this.hasClass("active");

		var model = {
			status: bool ? '未使用' : '已使用',
			value: bool ? '' : data.value,
			text: bool ? "优惠" : data.text,
			min: bool ? '' : data.min,
			type: bool ? 0 : data.type,
			couponamount: bool ? 0 : data.couponamount,
			ratehikeamount: bool ? 0 : data.ratehikeamount
		}

		var views = function(model) {
			redPacket_status.html(model.status);
			redPacket_type.html(model.text);
			redPacket_money.html(model.couponamount || '');
			invest_text.html(model.text);

			//UseCoupon.val(model.status);
			redPacket.val(model.value);


			redPacket.data({
				min: model.min,
				couponamount: model.couponamount,
				type: model.type,
				ratehikeamount: model.ratehikeamount
			})

			//样式
			if (bool) {
				$this.removeClass('active');
			} else {
				$this.addClass('active').siblings().removeClass('active');
			}

		};

		views(model);

	})
	
	//增加直接选中
	var isselected= $('.select-gift-item[data-isselected="True"]');
	if(isselected.length>0){
		isselected.trigger('click');
		$(document).off('click', '.select-red_packet')
	}



	//计算收益的方法
	function computeEarnings(bool) {
		var id = redPacket.val();
		var val = input.val() * 1;
		var type = redPacket.data('type');
		var min = redPacket.data('min') * 1;
		var couponamount = redPacket.data('couponamount') * 1;
		var ratehikeamount = redPacket.data('ratehikeamount') * 1;
		var limit = input.data('limit') * 1;
		var increment = 0;
		var attch_earnings = 0;
		var bool = (val >= min);
		var setState = function(bool) {
			redPacket.data('status', bool);
		}


		var router = {
			//投资红包
			'1': function() {
				increment = (val >= couponamount) ? couponamount : val;
				setState(true);
				redPacket_money.html(increment);
			},
			//满投红包
			'2': function() {
				increment = bool ? couponamount : 0;
				setState(bool);
			},
			//专享红包
			'4': function() {
				increment = bool ? couponamount : 0;
				setState(bool);
			},
			//加息
			'5': function() {
				attch_earnings = val * ratehikeamount / 10000;
				setState(bool);
			}
		};

		if (!!id) {
			router[type] && router[type]();
		}


		//计算收益
		var earnings = val * income / 10000;
		attch_earnings = attch_earnings || (increment * income / 10000);
		var toFixed = function(number) {
			number = Math.floor(number * 100);
			return number >= 1 ? ((number / 100).toFixed(2)) : 0;
		}

		var MobileToFixed =function(){
			return (toFixed(earnings)==0)? 0:
			 toFixed(toFixed(earnings)*1 + toFixed(attch_earnings)*1);
		}
		//折扣的部分
		invest_attach.html(toFixed(attch_earnings));
		//收益的部分
		invest_earnings.html(isMoblie ? MobileToFixed() : toFixed(earnings));

		YZP.callback && YZP.callback({
			el: input,
			max: limit
		});
	}


	function setVal(s){
		input	.val(s);
		computeEarnings();
	}

	var ev = ('oninput' in document) ? 'input' : 'keyup';
	input.on(ev + ' change', computeEarnings);
	
	//增加一个新手标的计算方法
	if(isNew=='True'){
			input.on('change.new',function(e){
				if(isNew!='True'){
					return ;
				};

				var $this=$(this);
				var max=$this.data('limit')*1;
				var val = $this.val();
				var count=0;

				if(val < 100){
					setVal(100);
					return ;
				}

				if(val>max){
					setVal(max);
					return ;
				}

				val=parseInt(val);
				count=val%100;
				if(count>0){
						val = val-count;
						setVal(val+100);
				}
				

				
			})
	}


function easyLayer(obj) {
		var templ =
			'<div class="Y_popup Y_popup_mask">' +
			'<style>' +
			'/* -------------------------------------------- *' +
			' * 弹出层' +
			' */' +
			'.Y_popup.hide{display: none;}'+
			'.Y_popup.Y_popup_mask{position:fixed;top:0;left:0;width:100%;height:100%;z-index:1600;}' +
			'.Y_popup.Y_popup_mask .Y_popup_mask_bg{position:absolute;left:0;top:0;width:100%;height:100%;opacity:.45;filter:alpha(opacity=45);background-color:#000;z-index:1;}' +
			'.Y_popup_row{position:absolute;top:100px;right:0;left:0;z-index:2;margin:auto;z-index:999;background-color:#fff;border-radius:10px;text-align:center;width:360px;}' +
			'.Y_popup_main{min-height: 40px;padding:20px;}' +
			'.Y_popup_main h2{font-weight:bold;font-size:16px;}' +
			'.Y_popup_main p{color:#666;margin-top:5px;}' +
			'.Y_popup_footer{border-top:1px solid #eee;line-height:45px;text-align:center;overflow:hidden;}' +
			'.Y_popup_footer a{text-align:center;display:block;color:#4bbdf0;}' +
			'.Y_popup_footer a:hover{color:#FF503F;}' +
			'.Y_popup_footer.g_2 .fn_closed,.Y_popup_footer.g_2 .fn_ok{width:50%;float:left;}' +
			'.Y_popup_footer.g_2 .fn_closed{color:#666;border-right:1px solid #ddd;margin-left:-1px;}' +
			'@media only screen and (max-width:680px){.Y_popup_row{width:90%!important;}}' +
			'.Y_popup_row.fn_is_auto,' +
			'.Y_popup_row.Y_popup_head{top: 100px;border-radius: 0;text-align: left;max-height:75%;overflow: hidden;overflow-y: auto;}' +
			'.Y_popup_row.Y_popup_head{top:60px;height:40px;border-bottom: 1px solid #ddd;text-align: right;background-color: #f8f8f8;}' +
			'.Y_popup_head .fn_closed{line-height:35px;margin-right: 10px;}' +
			'</style>' +
			'		<div class="Y_popup_mask_bg"></div>' +
			'		<div class="Y_popup_row">' +
			'			<div class="Y_popup_main">' +
			'					<h2>{{title}}</h2>' +
			'					<p class="{{show_sub}}">{{sub}}</p>' +
			'			</div>' +
			'			<div class="Y_popup_footer g_2">' +
			'				<a href="javascript:" class="fn_closed">' +
			'					<strong>返回修改</strong>' +
			'				</a>' +
			'				<a href="javascript:" class="fn_ok">' +
			'					<strong>确定</strong>' +
			'				</a>' +
			'			</div>' +
			'		</div>' +
			'</div>';
			if($('.Y_popup').length==0){
				$('body').append(YZP.template(templ,obj))
			}else{
				$('.Y_popup').removeClass('hide')
			}
	}

	$(document).on('click','.fn_closed',function(e){
		$('.Y_popup').addClass('hide');
		 submitBtn.removeAttr("disabled");
	})
	$(document).on('click','.fn_ok',function(e){
		$('.Y_popup').addClass('hide');
		 notSubmit=false;
		$("#form1").trigger('submit');
	})


	//判断是否可以提交
	$("form").on("submit", function(e) {

		var limit = input.data('limit') * 1;
		var min = input.data('min') * 1 || 1;
		var val = input.val() * 1
		var t_alert = function(msg) {
			YZP.alert(msg);
			setTimeout(function() {
				submitBtn.removeAttr("disabled");
			}, 250)
		}

		if (limit < val) {
			t_alert('最大投资金额为:' + limit);
			return false;
		}
		if (min > val) {
			t_alert('最小投资金额为:' + min);
			return false;
		}
		if (redPacket.length && !redPacket.data('status')) {
			t_alert('红包至少要投资' + redPacket.data('min') + '才可以使用.');
			return false;
		}

		if(invest_earnings.html()*1==0 && notSubmit){
			easyLayer({
    	title:'投资将不会产生任何收益，是否继续投资?',
    	show_sub:'hide',
    	sub:''
			})
			return false;
		} else {
			notSubmit=true;
		}	
	})




}));