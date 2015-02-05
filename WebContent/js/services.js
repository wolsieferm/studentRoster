managementApp.factory('StudentsFactory', function StudentsFactory() {

    var baseUrl = "http://localhost\\:8080";

    managementApp.factory('StudentFactory', function ($resource) {
        return $resource(baseUrl + '/', {}, {
            query: { method: 'GET', isArray: true },
            create: { method: 'POST' }
        })
    });

    managementApp.factory('StudentFactory', function ($resource) {
        return $resource(baseUrl + '/', {}, {
            show: { method: 'GET' },
            update: { method: 'PUT', params: {id: '@name'} },
            delete: { method: 'DELETE' }
        })
    return factory;
});