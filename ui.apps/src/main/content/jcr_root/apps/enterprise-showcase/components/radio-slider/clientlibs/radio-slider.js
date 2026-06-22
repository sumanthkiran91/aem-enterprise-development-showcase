(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-radio-slider").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
