/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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

