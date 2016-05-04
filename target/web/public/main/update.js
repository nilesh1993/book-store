(function() {
  var Updatecoffee;

  window.updatecoffee = Updatecoffee = (function() {
    function Updatecoffee() {}

    $(document).on('click', '#searchbttn', function() {
      return Updatecoffee.search();
    });

    $(document).on('click', '#updatebtn', function() {
      return Updatecoffee.update();
    });

    Updatecoffee.search = function() {
      var id, value;
      id = document.forms['updateForm']['BookId'].value;
      value = document.forms['updateForm']['mydropdown'].value;
      console.log("value----" + value);
      console.log("in search" + id);
      return jQuery.ajax({
        type: "GET",
        url: "/updateD/" + id + "/" + value,
        success: Updatecoffee.successCallback,
        error: Updatecoffee.failCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    Updatecoffee.addSearchRequestData = function() {
      var data;
      data = {};
      data['mydropdown'] = document.forms['searchForm']['mydropdown'].value;
      data['BookId'] = document.forms['searchForm']['BookId'].value;
      return JSON.stringify(data);
    };

    Updatecoffee.successCallback = function(data) {
      return $('#serchData').html(data);
    };

    Updatecoffee.failCallback = function(data) {
      return $('#serchData').html(data.responseText);
    };

    Updatecoffee.update = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/updateData",
        data: Updatecoffee.addUpdateData(),
        success: Updatecoffee.successCallback,
        error: Updatecoffee.failCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    Updatecoffee.addUpdateData = function() {
      var data;
      alert('add update');
      data = {};
      data['dropdown'] = document.forms['updateForm']['dropdown'].value;
      data['old'] = document.forms['updateForm']['old'].value;
      data['new'] = document.forms['updateForm']['new'].value;
      JSON.stringify(data);
      return console.log(data['old']);
    };

    return Updatecoffee;

  })();

}).call(this);

//# sourceMappingURL=update.js.map
