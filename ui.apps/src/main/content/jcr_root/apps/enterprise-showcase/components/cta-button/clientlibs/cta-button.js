(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-cta-button").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
