object LogerSenderApp extends App {
  val logger = Logger("prefix")
  logger.print("auto")

  val sender = Sender("header")
  sender.send("task")
}

case class Logger(prefix: String) {
  def print(message: String) = println(message + prefix)
}

case class Sender(header: String) {
  def send(message: String) = header + "\\n" + message
}