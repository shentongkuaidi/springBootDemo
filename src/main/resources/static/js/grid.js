var mydata = [], $grid;
$(function () {
    window.mydata = mydata = [
        {id:"6027023339",sex:"男",name:"沈通",age:"24",job:"数据治理中心"} ,
        {id:"6027023340",sex:"男",name:"邵蒙",age:"23",job:"数据治理中心"},
        {id:"6027023341",sex:"男",name:"徐王东",age:"22",job:"数据治理中心"}
    ];

    var opt = {
        data: mydata,
        dataType: 'json',
        height: 300,
        colModel: [{name: 'id', label: 'EmployeeId', headertitle: '工号', key: true},
            {name: 'sex', label: 'Sex', width: 90, headertitle: '性别'},
            {name: 'name', label: 'Name', width: 100, headertitle: '姓名'},
            {name: 'age', label: 'Age', width: 80, headertitle: '年龄'},
            {name: 'job', label: 'Job', width: 80, sortable: false}],
        rowNum: 5,
        rowList: [5, 10, 15],
        rownumbers: true,
        pager: true,
        pageData: mydata,
        gridview: false
    };

    $grid = $("#gridId").grid(opt);

    $('#loadEmployeeList').click(function () {
        $.ajax({
            type: 'post',
            url: '/list',
            data: {},
            dataType: 'json',
            async: false,
            success: function (data) {
                $.each(data.employeeList, function (index, el) {
                    console.log("员工号：" + el.id + "|| 姓名：" + el.name + "|| 年龄：" + el.age);
                });
                $("#gridId").grid("reloadData", data.employeeList);
            }
        })
    });

    $('#loadEmployee').click(function () {
        $.ajax({
            type: 'post',
            url: '/list',
            data: {"id":"6027023339"},
            dataType: 'json',
            async: false,
            success: function (data) {
                $.each(data.employeeList, function (index, el) {
                    console.log("员工号：" + el.id + "|| 姓名：" + el.name + "|| 年龄：" + el.age);
                });
                $("#gridId").grid("reloadData", data.employeeList);
            }
        })
    })
});



