(function () {
    "use strict";
    document.addEventListener("DOMContentLoaded", function () {
        document.querySelectorAll(".cmp-dynamic-table").forEach(function (component) {
            component.dataset.initialized = "true";
        });
    });
}());
