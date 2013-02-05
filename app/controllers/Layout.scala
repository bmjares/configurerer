package controllers

import play.api._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import models._
import views._

object Layout extends Controller {
  
  def show = Action {
    Ok("works")
  }

}