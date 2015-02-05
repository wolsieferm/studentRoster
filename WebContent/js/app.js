var managementApp = angular.module('managementApp',
    [
        'ngRoute',
        'managementApp.services',
        'managementApp.controller'
        ]);

managementApp.config(function ($routeProvider, $httpProvider) {
   $routeProvider
      .when('/', 
        {
          controller: 'StudentsCtrl',
          templateUrl: 'partials/studentList.html'
        });

   $httpProvider.defaults.useXDomain = true;
     delete $httpProvider.defaults.headers.common['X-Requested-With'];
 });