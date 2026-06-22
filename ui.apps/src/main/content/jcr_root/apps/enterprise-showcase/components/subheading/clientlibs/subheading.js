(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-subheading").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
