(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-adaptive-form-button").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
