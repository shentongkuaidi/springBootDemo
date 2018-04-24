$(function () {
    //从静态资源获取
    // var $address = $('.address').cascadeselect({
    // dataSource: [{"id":"011","name":"安徽省","children":[{"id":"01","name":"蚌埠市","children":[{"id":"0","name":"五河县"}]}]}],
    //     dataSource: 'dataSource/cityData.json',
    //     selectors: ['.provice', '.city', '.region']
    // });
    var $address;
    $.ajax({
        type: 'post',
        url: '/getArea',
        dataType: 'json',
        data: {},
        async: false,
        success: function (data) {
            $address = $('.address').cascadeselect({
                dataSource: data,
                selectors: ['.provice', '.city', '.region']
            })
        }
    });

    $('.btn1').click(function () {
        console.log($address.cascadeselect('value'));
    });
    $('.btn2').click(function () {
        $address.cascadeselect('value', [809, 810, 818])
    });
    $('.btn3').click(function () {
        var provices = [];
        var citys = [];
        var regions = [];
        $.get('dataSource/cityData.json').done(function (data) {
            console.log("加载数据！");
            $.each(data, function (index, provice) {
                var pro = {};
                // console.log("省份：" + provice.name + " 代号：" + provice.id + "---包含的市、区(市级)：");
                pro.proid = provice.id;
                pro.proname = provice.name;
                provices.push(pro);
                $.each(provice.children, function (index, city) {
                    // console.log("代号：" + city.id + " " + city.name + "包含的县、区(县级)");
                    var cit = {};
                    cit.citid = city.id;
                    cit.citname = city.name;
                    cit.proid = provice.id;
                    citys.push(cit);
                    if (city.children === undefined) return '';
                    $.each(city.children, function (index, region) {
                        // console.log(region.id + " " + region.name);
                        var reg = {};
                        reg.regid = region.id;
                        reg.regname = region.name;
                        reg.citid = city.id;
                        regions.push(reg);
                    })
                })
            });
            // // 测试集合中的数据结果
            // $.each(provices, function (index, el) {
            //     console.log("1级：" + el.proname + "-->");
            // });
            // $.each(citys, function (index, el) {
            //     console.log("2级：" + el.citname + el.proid);
            // });
            // $.each(regions, function (index, el) {
            //     console.log("3级：" + el.regname + el.citid);
            // });
            var params = {};
            params.pList = provices;
            params.cList = citys;
            params.rList = regions;
            $.ajax({
                type: "post",
                url: "/addArea",
                dataType: "json",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(params),
                async: false,
                success: function (data) {
                    if (data.result === "1") console.log("ok!");
                    else console.log("oh no!")
                }
            })
        })
    })
});