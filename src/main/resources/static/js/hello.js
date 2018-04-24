$(function () {
    var AppView1 = fish.View.extend({
        manage: true,
        el: '#app-1',
        template: fish.compile('<p>{{message}}</p>'),
        serialize: {
            message: '1.Hello Fish!'
        }
    });
    new AppView1().render();


    var AppView2 = fish.View.extend({
        manage: true,
        el: '#app-2',
        template: fish.compile('{{#if shown}}\
        <p>2.hello,fish!</p>\
        {{/if}}'),
        serialize: {
            shown: true
//        	shown: false
        }
    });
    new AppView2().render();

    var AppView3 = fish.View.extend({
        manage: true,
        el: '#app-3',
        template: fish.compile('{{#each students}}\
          	<li>3.{{this.name}}&nbsp;&nbsp;{{this.age}}</li>\
          	{{/each}}'),
        serialize: {
            students: [
                {name: 'st', age: 23},
                {name: 'xwd', age: 22},
                {name: 'sm', age: 21}
            ]
        }
    });
    new AppView3().render();

    var AppView4 = fish.View.extend({
        manage: true,
        el: '#app-4',
        template: fish.compile('<form>\
        <div class="form-group">\
            <label>Username</label>\
            <input type="text" class="form-control js-username">\
        </div>\
        <div class="form-group">\
            <button type="button" class="btn btn-primary">Click</button>\
        </div>\
    </form>'),
        events: {
            'click .btn': 'onClick'
        },

        onClick: function () {
            this.$('.js-username').val('Li Lei');
        }
    });
    new AppView4().render();


    var AppView5 = fish.View.extend({
        manage: true,
        el: '#app-5',
        template: fish.compile('<form>\
        <div class="form-group">\
            <label>Username</label>\
            <input type="text" class="form-control">\
        </div>\
        <div class="form-group">\
            <label>Gender</label>\
            <input type="text" class="form-control js-gender">\
        </div>\
        <div class="form-group">\
            <label>Birthday</label>\
            <div class="input-group">\
                <input type="text" class="form-control js-birthday">\
            </div>\
        </div>\
    </form>'),
        afterRender: function () {
            // 下拉列表控件初始化
            this.$('.js-gender').combobox({
                dataSource: [
                    {name: 'Male'},
                    {name: 'Female'},
                    {name: 'Unknown'}
                ]
            });

            // 日期控件初始化
            this.$('.js-birthday').datetimepicker();
        }
    });
    new AppView5().render();

});
	
