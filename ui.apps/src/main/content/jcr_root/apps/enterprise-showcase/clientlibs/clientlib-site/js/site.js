(function(){
  document.querySelectorAll('[data-cmp-is="modal"]').forEach(function(modal){
    var trigger=modal.querySelector('.cmp-modal__trigger');
    var dialog=modal.querySelector('.cmp-modal__dialog');
    var close=modal.querySelector('.cmp-modal__close');
    if(trigger&&dialog){trigger.addEventListener('click',function(){dialog.hidden=false;trigger.setAttribute('aria-expanded','true');});}
    if(close&&dialog){close.addEventListener('click',function(){dialog.hidden=true;if(trigger){trigger.setAttribute('aria-expanded','false');}});}
  });
  document.querySelectorAll('[data-cmp-is="number-slider"]').forEach(function(cmp){
    var input=cmp.querySelector('input[type="range"]'); var reset=cmp.querySelector('.cmp-number-slider__reset'); var original=cmp.getAttribute('data-original-value');
    if(input&&reset){input.addEventListener('input',function(){reset.hidden=input.value===original;}); reset.addEventListener('click',function(){input.value=original;reset.hidden=true;});}
  });
})();
