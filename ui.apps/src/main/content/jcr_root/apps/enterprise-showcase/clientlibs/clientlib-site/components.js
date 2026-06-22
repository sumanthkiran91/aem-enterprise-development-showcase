(function(){
  document.addEventListener('click', function(event){
    var button = event.target.closest('.cmp-af-button,.cmp-cta-button');
    if(!button){return;}
    if(button.dataset.action){console.log('AEM portfolio action:', button.dataset.action, button.dataset.ruleTarget || '');}
  });
})();
