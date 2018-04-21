var detailsTempl = {
	"1": '<ul class="dlist">' +
		'    <li class="dlist-item">' +
		'        <span class="fl"> <em class="detailIcon icon-money"></em>' +
		'        </span>' +
		'        <div class="bd">' +
		'            <h3>安全理财</h3>' +
		'            <p>' +
		'                银子铺立足长远，把用户的投资安全放在首位！大股东均是业界名人，声望卓著，是银子铺最大的信用保证，我们深知，P2P互联网金融最核心的就是风险控制，因此银子铺在风控上一丝不苟，用户的安全是银子铺发展的最大倚仗！' +
		'            </p>' +
		'        </div>' +
		'    </li>' +
		'    <li class="dlist-item">' +
		'        <span class="fr"> <em class="detailIcon icon-safe"></em>' +
		'        </span>' +
		'        <div class="bd">' +
		'            <h3>资金流向</h3>' +
		'            <p>用户的投资均走第三方通道，银子铺不设资金池，通过良好的风控机制保证用户的资金安全。</p>' +
		'        </div>' +
		'    </li>' +
		'    <li class="dlist-item">' +
		'        <div class ="bd">' +
		'            <h3>理财流程</h3>' +
		'            <ul class="invest-step">' +
		'                <li class="invest-step-item">' +
		'                    <span class="txt">免费注册</span> <i class="icon"></i>' +
		'                </li>' +
		'                <li class="invest-step-item">' +
		'                    <span class="txt">账户充值</span> <i class="icon"></i>' +
		'                </li>' +
		'                <li class="invest-step-item">' +
		'                    <span class="txt">投资理财</span>' +
		'                    <i class="icon"></i>' +
		'                </li>' +
		'                <li class="invest-step-item">' +
		'                    <span class="txt">按月还息,到期还本</span>' +
		'                </li>' +
		'            </ul>' +
		'        </div>' +
		'    </li>' +
		'</ul>',
	"3": '<ul class="dlist" id="flexibleInfo">' +
		'  <li class="dlist-item nobor">' +
		'    <div class="bd">' +
		'      <h3>综合描述</h3>' +
		'      <p>' +
		'        该理财项目以实际车辆为质押,市场价值远远大于借款额度,质押车辆已停放在指定的车库,由银子铺为投资者代为监管,<span class="ckey">有质押才安心,风险控制从源头做起.' +
		'      </p>' +
		'    </div>' +
		'  </li>' +
		'  <li id="imglist" class="dlist-item nobor empty">' +
		'    <h3>权证信息</h3>' +
		'    {{listHTML}}' +
		'  </li>' +
		'  <li class="dlist-item nobor">' +
		'    <div class="bd">' +
		'      <h3>三重风控</h3>' +
		'     <p>1: 借款方必须以车辆做实物质押</p>' +
		'     <p>2: 质押物价值必须远远高于借款</p>' +
		'     <p>3: 质押车须由银子铺来统一监管</p>' +
		'    </div>' +
		'  </li>' +
		'  <li class="dlist-item nobor">' +
		'    <div class="bd">' +
		'      <h3>安全保障</h3>' +
		'     <p>• 放款前充分尽调，进行资产审核，借款征信，还款能力及还款来源的严格考察；</p>' +
		'     <p>• 借款金额不高于抵（质）押资产实际金额的百分之五十；</p>' +
		'     <p>• 合作机构为借款人提供担保。如借款人面临逾期，合作机构将及时偿付投资人本息；</p>' +
		'     <p>• 若合作机构不能进行及时垫付，平台以风险准备金，按期支付投资人本息；</p>' +
		'    </div>' +
		'  </li>' +
		'</ul>',
	"2": '<style>' +
		'.attr-item{' +
		'display: inline-block;' +
		'margin-right: 50px;' +
		'}.attr-list li:last-child{margin: 0;}' +
		'.attr-tt{color: #888;}.dlist{padding:0}' +
		'</style><ul class="dlist">' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>项目简介</h3>' +
		'      <p>' +
		'        该理财项目以实际车辆为质押,市场价值远远大于借款额度,质押车辆已停放在指定的车库,由银子铺为投资者代为监管,<span class="ckey">有质押才安心,风险控制从源头做起.</p>' +
		'    </div>' +
		'  </li>' +
		'  <li  class="dlist-item">' +
		'    <h3>相关信息</h3>' +
		'    {{listHTML}}' +
		'  </li>' +
		'  <li id="imglist" class="dlist-item nobor empty">' +
		'    <h3>权证信息</h3>' +
		'    {{imglist}}' +
		'  </li>' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>审核信息</h3>' +
		'      <div class="audit">' +
		'        <span class="item">' +
		'          <i class="icon">&#xe615;</i>' +
		'          身份证' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe648;</i>' +
		'          征信报告' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe647;</i>' +
		'          行驶证' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe649;</i>' +
		'          车辆登记证' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe645;</i>' +
		'          车辆登记发票' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe613;</i>' +
		'          车辆交强险' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe605;</i>' +
		'          车辆商业保险' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe646;</i>' +
		'          车辆评估认证' +
		'        </span>' +
		'      </div>' +
		'    </div>' +
		'  </li>' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>风控信息</h3>' +
		'      <p>调查：风控部对借款人及车辆各项信息进行了全面的审核，一切资料真实可靠。</p>' +
		'      <p>抵押物：{{MortgageName}}。</p>' +
		'      <p>权证：车辆质押车库。</p>' +
		'      <p>结论：借款人居住稳定，收入来源可靠，经风控综合评估，同意放款。</p>' +
		'      <div class="risk-box ">' +
		'        <span class="item">' +
		'          <i class="icon">&#xe638;</i>' +
		'          资料审核' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe643;</i>' +
		'          资产审核' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe649;</i>' +
		'          资产评估' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe644;</i>' +
		'          发布借款' +
		'        </span>' +
		'      </div>' +
		'      <div class="conclusion">' +
		'        结论：经风控部综合评估，' +
		'        <span class="c-key">同意放贷!</span>' +
		'      </div>' +
		'    </div>' +
		'  </li>' +
		'</ul>',
	"4": '<style>' +
		'  .dlist-item h3{color: #4bbdf0;}' +
		'  .icon_circle{width:25px;height: 25px;line-height: 25px;text-align: center;display: inline-block;border-radius: 50%;color: #fff;background-color: #4bbdf0;margin-right:10px;}' +
		'</style>' +
		'<ul class="dlist">' +
		'          <li class="dlist-item">' +
		'            <span class="fr" style="margin-left: 30px;">' +
		'              <img src="http://assets.yinzipu.com/www/img/details/novice01.png" alt=""></span>' +
		'            <div class="bd">' +
		'              <h3><span class="icon_circle">1</span>产品描述</h3>' +
		'              <p>' +
		'                在银子铺官网、手机APP、微信等平台未成功注册过的新用户，即可参加' +
		'                <span class="c-key">6000</span>' +
		'                元新手体验金活动，产品到期就能领取' +
		'                <span class="c-key">8.8</span>' +
		'                元的收益，可提现！' +
		'              </p>' +
		'              <p style="color: #999;">（注：新手体验金仅限于为计算收益之基数，不视为任何形式的现金及等价物，亦不得提现。）</p>' +
		'              <p>* 不计入净值贷额度，不参与推荐有奖</p>' +
		'            </div>' +
		'          </li>' +
		'          <li class="dlist-item">' +
		'            <span class="fl" style="margin-right:30px;margin-top:-30px;">' +
		'              <img src="http://assets.yinzipu.com/www/img/details/novice02.png" alt=""></span>' +
		'            <div class="bd">' +
		'              <h3><span class="icon_circle">2</span>收益怎么计算</h3>' +
		'              <p>万元户10000元新手体验金，将在2天后给您收益：</p>' +
		'              <p style="color:#FF503F;font-size:16px;font-weight: bold;">6000*10.8%*5/365≈8.8元</p>' +
		'            </div>' +
		'          </li>' +
		'          <li class="dlist-item">' +
		'            <span class="fr" style="margin-left: 30px;">' +
		'              <img src="http://assets.yinzipu.com/www/img/details/novice03.png" alt=""></span>' +
		'            <div class="bd">' +
		'              <h3><span class="icon_circle">3</span>如何申购</h3>' +
		'              <p>' +
		'                银子铺未成功注册过的新用户，即可获得' +
		'                <span class="c-key">6000</span>' +
		'                元新手体验金，享5天年化' +
		'                <span class="c-key">10.8%</span>' +
		'                的收益，购买次日起息。' +
		'              </p>' +
		'            </div>' +
		'          </li>' +
		'          <li class="dlist-item">' +
		'            <span class="fl">' +
		'              <img src="http://assets.yinzipu.com/www/img/details/novice04.png" alt=""></span>' +
		'            <div class="bd">' +
		'              <h3><span class="icon_circle">4</span>怎么赎回</h3>' +
		'              <p>' +
		'                到期后，' +
		'                <span class="c-key">8.8</span>' +
		'                元收益将放至您的银子铺账户余额，可直接提现。' +
		'              </p>' +
		'              <p style="color: #999;">( 注：为保障您的资金安全，使用快捷支付的用户需遵循同卡进出规则，即购买与提现使用的银行卡必须一致。)</p>' +
		'            </div>' +
		'          </li>' +
		'          <li class="dlist-item">' +
		'            <span class="fr">' +
		'              <img src="http://assets.yinzipu.com/www/img/details/novice05.png" alt=""></span>' +
		'            <div class="bd">' +
		'              <h3><span class="icon_circle">5</span>适用人群</h3>' +
		'              <p>仅限新注册用户，每人只有一次体验机会。</p>' +
		'            </div>' +
		'          </li>' +
		'          <li class="dlist-item">' +
		'            <div class="bd">' +
		'              注：' +
		'              <p>' +
		'                1、手机号码能成功接听的用户才赠送，如是拨通不了、关机、拨通后无人接的状态，将不赠送；认证成功后7天内为申诉期，如有疑问可向客服反映，逾期将不予处理，视为自动放弃；' +
		'              </p>' +
		'              <p>2、一旦后台检测到恶意刷单，平台有权拒绝提现。</p>' +
		'            </div>' +
		'          </li>' +
		'        </ul>',
		"7": '<style>' +
		'.attr-item{' +
		'display: inline-block;' +
		'margin-right: 50px;' +
		'}.attr-list li:last-child{margin: 0;}' +
		'.attr-tt{color: #888;}.dlist{padding:0}' +
		'</style><ul class="dlist">' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>项目简介</h3>' +
		'      <p>' +
		'        本项目为个人购车贷款产品，购车人与汽车销售服务公司签订分期购车服务协议，在银行按揭贷款审批时间周期内，该汽车销售服务公司受购车人委托，在银行按揭贷款额度内，向“银子铺”平台申请融资，用于银行按揭贷款放款前的垫资代购，汽车销售公司承担连带担保责任。</p>' +
		'    </div>' +
		'  </li>' +
		'  <li  class="dlist-item">' +
		'    <h3>相关信息</h3>' +
		'    {{listHTML}}' +
		'  </li>' +
		'  <li id="imglist" class="dlist-item nobor empty">' +
		'    <h3>权证信息</h3>' +
		'    {{imglist}}' +
		'  </li>' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>风控信息</h3>' +
		'      <p>调查：风控部对借款人及购车情况进行了全面的审核，一切资料真实可靠。</p>' +
		'      <div class="risk-box ">' +
		'        <span class="item">' +
		'          <i class="icon">&#xe638;</i>' +
		'          资料审核' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe643;</i>' +
		'          征信审核' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe649;</i>' +
		'          实地调查' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe644;</i>' +
		'          发布借款' +
		'        </span>' +
		'      </div>' +
		'      <div class="conclusion">' +
		'        结论：经风控部综合评估，' +
		'        <span class="c-key">同意放贷!</span>' +
		'      </div>' +
		'    </div>' +
		'  </li>' +
		'</ul>',
		"8": '<style>' +
		'.attr-item{' +
		'display: inline-block;line-height: 30px;' +
		'margin-right: 50px;' +
		'}.attr-list li:last-child{margin: 0;}' +
		'.attr-tt{color: #888;}.dlist{padding:0}' +
		'</style><ul class="dlist">' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>项目简介</h3>' +
		'      <p>' +
		'        该项目为优选合作车商借贷项目，借款人为区域实力车商。因开拓市场及拓展业务范围需要，需进行短期经营性资金周转，故将持有的车辆作为质押担保物，向"银子铺“平台申请融资借款，质押物价值远大于借款金额。</p>' +
		'    </div>' +
		'  </li>' +
		'  <li  class="dlist-item">' +
		'    <h3>相关信息</h3>' +
		'    {{listHTML}}' +
		'  </li>' +
		'  <li id="imglist" class="dlist-item nobor empty">' +
		'    <h3>权证信息</h3>' +
		'    {{imglist}}' +
		'  </li>' +
		'  <li class="dlist-item">' +
		'    <div class="bd">' +
		'      <h3>风控信息</h3>' +
		'      <p>调查：风控部对公司背景、运营模式以及质押车辆进行了全面的审核，一切资料真实有效。</p>' +
		'      <div class="risk-box ">' +
		'        <span class="item">' +
		'          <i class="icon">&#xe638;</i>' +
		'          资料审核' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe643;</i>' +
		'          车辆调查' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe649;</i>' +
		'          车辆评估' +
		'        </span>' +
		'        <span class="item">' +
		'          <i class="icon">&#xe644;</i>' +
		'          发布借款' +
		'        </span>' +
		'      </div>' +
		'      <div class="conclusion">' +
		'        结论：车商公司发展稳定，经营模式正常，经风控综合评估, ' +
		'        <span class="c-key">同意放贷!</span>' +
		'      </div>' +
		'    </div>' +
		'  </li>' +
		'</ul>',
}


$(function() {

	var block = $("#mod-details");
	var type = block.data("type");
	var url = block.data("load");
	var sdata = block.attr("data-json");
	var jsonData = $.parseJSON(sdata);
	var type = jsonData.CrowdfundingTypeID;
	var hasImgList = false;

	var objList = {
		company: [{
			key: '企业名称',
			value: 'EnterpriseName',
			'unit': '**'
		}, {
			key: '执照代码',
			value: 'BusinessLicenseCode',
			'unit': ''
		}],
		person: [{
			key: '姓名',
			value: 'FirstName',
			'unit': '**'
		}, {
			key: '身份证',
			value: 'IDCode',
			'unit': ''
		}]
	}



	var obj = [{
		key: '车型',
		value: 'MortgageName',
		'unit': ' '
	}, {
		key: (type==7 || type==8 ) ? '购车价格' : '市场估值' ,
		value: 'MarketPrice',
		'unit': '万'
	}, {
		key: '实际借款',
		value: 'Amount',
		'unit': '万'
	}]

	if(type==8){
		obj.push({
	  key: '车辆识别代号',
		value: 'CarVin',
		'unit': ''
		})
	}
	if (jsonData.BorrowerType == '企业') {
		obj = objList.company.concat(obj)
	} else {
		obj = objList.person.concat(obj)
	}


	/**
	 * [addValue 添加参数到json]
	 * @param {[type]} arr  [description]
	 * @param {[type]} json [description]
	 */
	var addValue = function(obj) {
		var json = {}
		$.each(obj, function(v, n) {
			if (jsonData[n.value]) {
				json[n.key] = jsonData[n.value] + n.unit
			}
		})
		return json;
	}

	var SetTemplate = function(sdata) {
			var json = {};
			var data = $.parseJSON(sdata.Introduce);
			if (type == 2 && $.isEmptyObject(data)) {
				block.html(detailsTempl["1"]);
				return;
			} else {
				// 序列自定义json 内容
				$.each(data, function(n, v) {
					json[n] = v.value;
					if (n == 'imglist') {
						if (v.length == 0) {
							return;
						}
						$('.details-car-item-img').css({
							'background-image': 'url(' + v[0].src + ')'
						});
						hasImgList = true;
						var sTemp = '<a  class="imgbox swiper-slide" style="background-image: url({{surl}});" ></a>'
						var fullTemp = '<a  class="imgbox swiper-slide" ><img src="{{src}}" alt=""></a>'
						var shtml = '';
						var fullHtml = '';
						$.each(v, function(key, value) {
							shtml += YZP.template(sTemp, value);
							fullHtml += YZP.template(fullTemp, value);
						});
						json[n] = '<div class="swiper-container-list" >' +
							'<div class="swiper-wrapper">' + shtml + '</div></div>' +
							'<div class=" swiper-container-full" >' +
							'<div class="swiper-wrapper">' + fullHtml + '</div></div><a class="arrow-left"></a><a class="arrow-right"></a>'
					}
				});


				var listHTML = '';
				var itemHTML = '<li class="attr-item"><span class="attr-tt">{{key}} :</span> {{value}} </li>';
				$.each(addValue(obj), function(key, value) {
					listHTML += YZP.template(itemHTML, {
						'key': key,
						'value': value
					});
				})
				json['listHTML'] = '<ul class="attr-list">' + listHTML + '</ul>';
				json['MortgageName'] = jsonData['MortgageName'];

			}
			var html = YZP.template(detailsTempl[type], json);
			block.html(html);
		}
		// hack 解决一类问题. 1,股票配资,2,债权转让,3,银车贷
	if (!detailsTempl[type]) {
		block.html(detailsTempl["1"]);
	} else {
		SetTemplate(jsonData);
	}

	//车贷 执行脚本
	var viewer_img = $("#photo-viewer-img");
	$(document).on('click', '.photo-viewer-thumbnails', function() {
		var src = $(this).find('img').attr('src');
		viewer_img.attr('src', src);
		$(this).addClass('active').siblings().removeClass('active')
	})

	//图片列表执行操作
	if (hasImgList) {


		$("#imglist").removeClass('empty');

		YZP.loadJS('http://assets.yinzipu.com/www/plugins/swiper/2.7.0//idangerous.swiper.min.js', function() {
			var isSwiper = ($(".swiper-container-list img").length >= 6)
			if (isSwiper) {
				var mySwiper = new Swiper('.swiper-container-list', {
					slidesPerView: 'auto',
				});
				mySwiper.container.style.height = "100px";
			} else {
				$("#imglist").addClass('hide-arrow');
			}



			var mySwiper2 = new Swiper('.swiper-container-full', {
				mousewheelControl: true
			});

			//附加显示大图事件
			$(document).on('click', '.swiper-container-list .swiper-slide', function(e) {
				$('body').addClass('js-is-full');
				var index = $('.swiper-container-list .swiper-slide').index(this);
				mySwiper2.swipeTo(index, 0, false);
			})

			//翻页动作
			$('.arrow-left').on('click', function(e) {
				e.preventDefault()
				isSwiper && mySwiper.swipePrev();
				mySwiper2.swipePrev();
			})
			$('.arrow-right').on('click', function(e) {
				e.preventDefault()
				isSwiper && mySwiper.swipeNext();
				mySwiper2.swipeNext();
			});

			//隐藏大图
			$(document).on('click', '.swiper-container-full', function(e) {
				$('body').removeClass('js-is-full')
			})

		})
	}
})