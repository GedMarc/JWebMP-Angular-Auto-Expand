JW_APP_NAME.directive('autoExpand', autoExpand);

function autoExpand() {
    return {
        restrict: 'A',
        link: function ($scope, elem) {
            elem.bind('keydown', function ($event) {
                var element = $event.target;
                $(element).height(0);
                var height = $(element)[0].scrollHeight;
                height = (height < 16) ? 16 : height;
                $(element).height(height);
            });

            // Expand the textarea as soon as it is added to the DOM
            setTimeout(function () {
                var element = elem;
                $(element).height(0);
                var height = $(element)[0].scrollHeight;
                height = (height < 16) ? 16 : height;
                $(element).height(height);
            }, 0)
        }
    };
}

