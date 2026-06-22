(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-tabs-v1").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
