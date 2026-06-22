(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-modal").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
