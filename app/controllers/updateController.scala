package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

/**
 * Created by njm1688 on 5/4/16.
 */
class updateController(renderer: JadeRenderer) extends Controller {

  def update() = Action{

    println("In update controller")
    Ok("fd")
  }


  def renderUpdatePage()= Action{

    Ok(renderer.render("updateData"))
  }

}
