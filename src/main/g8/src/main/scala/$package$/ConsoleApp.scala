package com.example

import cats._
import cats.implicits._
import zio._
import zio.Console._

case class Student(email: String, nrOfLessons: Int)

trait Lesson[F[_]] {
  def takeLesson(email: String): F[Student]
}

object ConsoleApp extends ZIOAppDefault {

  def run =
    for {
      _ <- printLine("Hello! World")
    } yield ()
}
