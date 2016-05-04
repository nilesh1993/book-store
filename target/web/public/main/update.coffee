window.updatecoffee = class Updatecoffee


	$(document).on 'click', '#searchbttn', =>
		@search()

	$(document).on 'click', '#updatebtn', =>
		@update()

	@search: =>
		id = document.forms['updateForm']['BookId'].value
		value = document.forms['updateForm']['mydropdown'].value
		#alert('hello')
		console.log("value----"+ value)
		console.log("in search"+id)
		jQuery.ajax({
				type:"GET",
				url:"/updateD/"+id+"/"+value,
				#data: @addSearchRequestData()
				success: @successCallback,
				error: @failCallback
				contentType: "application/json"
				dataType: "json"
			})

	@addSearchRequestData: =>
		data = {}
		data['mydropdown']= document.forms['searchForm']['mydropdown'].value
		data['BookId']= document.forms['searchForm']['BookId'].value
		JSON.stringify(data)
		#console.log(data['mydropdown'],data['BookId'])

	@successCallback: (data)=>
		$( '#serchData' ).html(data)

	@failCallback: (data)=>
		$( '#serchData' ).html(data.responseText)

	@update: =>
		jQuery.ajax({
				type:"POST",
				url:"/updateData",
				data: @addUpdateData()
				success: @successCallback,
				error: @failCallback
				contentType: "application/json"
				dataType: "json"
			})

	@addUpdateData: =>
		alert('add update')
		data = {}
		data['dropdown']= document.forms['updateForm']['dropdown'].value
		data['old']= document.forms['updateForm']['old'].value
		data['new']= document.forms['updateForm']['new'].value
		JSON.stringify(data)
		console.log(data['old'])
