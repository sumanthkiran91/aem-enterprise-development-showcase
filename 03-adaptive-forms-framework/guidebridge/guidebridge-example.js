(function () {
  'use strict';

  function onGuideBridgeReady() {
    if (!window.guideBridge) { return; }

    window.guideBridge.on('elementValueChanged', function (event) {
      console.log('Adaptive Form field changed:', event.target.somExpression);
    });
  }

  if (window.guideBridge) { onGuideBridgeReady(); }
  else { document.addEventListener('bridgeInitializeStart', onGuideBridgeReady); }
}());
