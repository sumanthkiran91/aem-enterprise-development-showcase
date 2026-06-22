(function () {
  'use strict';
  document.querySelectorAll('[data-cmp-is="dynamic-table"]').forEach(function (component) {
    component.setAttribute('data-ready', 'true');
  });
}());
