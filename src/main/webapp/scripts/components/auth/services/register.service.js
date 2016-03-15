'use strict';

angular.module('fileshareApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


