(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-page-title").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
