package controllers

import play.api.mvc.{Controller, Action}

import scala.util.parsing.json.JSONObject

/**
 * Created by njm1688 on 4/28/16.
 */
class addController(renderer: JadeRenderer) extends Controller {

  def add() = Action{

    request => {

      //println("In AddController")
      //println("request"+request.body)
      //var list = collection.mutable.ListBuffer()
      val json = request.body.asJson.get
      var list = collection.mutable.ListBuffer("")

      request.body.asJson.map { json =>
        (json \ "BookId").asOpt[String].map { BookId =>
          list += BookId
        }
      }

      request.body.asJson.map { json1 =>
        (json1 \ "BookName").asOpt[String].map { BookName =>
          list += BookName
        }
      }

      request.body.asJson.map { json1 =>
        (json1 \ "BookAuthor").asOpt[String].map { BookAuthor =>
          list += BookAuthor
        }
      }

       // println("BookId-------"+list(1))

//      val BookId: Seq[String] = request.body.asFormUrlEncoded.get("BookId")
//      val BookName: Seq[String] = request.body.asFormUrlEncoded.get("BookName")
//      val BookAuthor = request.body.asFormUrlEncoded.get("BookAuthor")

      val addService: addServiceController = new addServiceController()
      addService.add(list(1),list(2),list(3))

      Ok(json)


    }

  }

  def renderAddPage()=Action{

    Ok(renderer.render("addData"))
  }

}
