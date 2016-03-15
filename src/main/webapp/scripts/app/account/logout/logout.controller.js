'use strict';

angular.module('fileshareApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
