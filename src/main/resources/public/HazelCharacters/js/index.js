var mainApp = angular.module('mainApp', ['ui.router']);

mainApp.config(function ($stateProvider, $urlRouterProvider, $locationProvider) {
    $locationProvider.html5Mode(true);
    $urlRouterProvider.otherwise('/');
    $stateProvider
        .state('HazelCharacters', {
            url: '/',
            templateUrl: '/public/index.html'
    });
});

mainApp.controller('hazelCharacterController', function ($scope, $http) {
});