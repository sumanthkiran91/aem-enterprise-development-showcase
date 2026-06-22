(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-number-slider").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
