package controllers

import java.net.URI

import com.marklogic.xcc.{ResultSequence, Session, ContentSourceFactory}
import play.api.libs.json.Json
import play.api.mvc._


/**
 * Created by njm1688 on 4/20/16.
 */
class searchController(renderer: JadeRenderer) extends Controller {

  def search(id:String, value:String) = Action {

    request => {

  //      val BookId: Seq[String] = request.body.asFormUrlEncoded.get("BookId")
  //      val dropdownValue: Seq[String] = request.body.asFormUrlEncoded.get("mydropdown")
        val searchService = new searchServiceController()
        //var list = collection.mutable.ListBuffer("")
        //val json = request.body.asJson.get
        //println("json"+json)

      val rs = searchService.search(id,value)
     // val abc= Json.toJson(rs.asString())
      //println("rs--------"+rs)
      if(rs.isEmpty){
        NotFound("No data found")
      }
      else {
        Ok(Json.toJson(rs.asString()))

      }
    }
  }

  def renderSearchPage()=Action{

    Ok(renderer.render("searchData"))
  }

}
