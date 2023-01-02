package com.example

import cats._
import cats.implicits._
import zio._
import zio.Console._

object ConsoleApp extends ZIOAppDefault {

  def run =
    for {
      _ <- printLine("Hello! World")
    } yield ()
}
