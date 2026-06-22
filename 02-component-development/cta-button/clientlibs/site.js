(function () {
  'use strict';
  document.querySelectorAll('[data-cmp-is="cta-button"]').forEach(function (component) {
    component.setAttribute('data-ready', 'true');
  });
}());
