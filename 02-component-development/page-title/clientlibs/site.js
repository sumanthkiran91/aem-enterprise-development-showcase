(function () {
  'use strict';
  document.querySelectorAll('[data-cmp-is="page-title"]').forEach(function (component) {
    component.setAttribute('data-ready', 'true');
  });
}());
