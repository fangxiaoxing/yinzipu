(function(factory) {
	if (typeof define === "function" && define.amd) {
		// AMD. Register as an anonymous module.
		define([], factory);
	} else {
		factory();
	}
}(function() {
	$(function() {
		$(document).on('click','.select-box',function(e){
			var $this=$(this),
				  target=$this.data('target');
				  $(target).toggleClass('active');

		})

		$('.product-item').eq(15).hide();

	})
}));