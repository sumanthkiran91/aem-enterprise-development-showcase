(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-grid-v1").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
