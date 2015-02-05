managementApp.controller('StudentsCtrl', [
    '$scope',
    'StudentsFactory',
    '$location'
]
    function StudentsCtrl($scope, StudentsFactory, $location) {

        $scope.students = StudentsFactory.query();
        $scope.StudentsFactory = StudentsFactory;

        $scope.editStudent = function(studentName){
            $location.path('/update' + studentName);
        }

        $scope.deleteStudent = function(name){
            StudentsFactory.delete(name);
            $scope.students = StudentFactory.query();
        }

        $scope.addStudent = function() {
            $location.path('/addStudent');
        }


});