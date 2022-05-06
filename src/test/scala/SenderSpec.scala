import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SenderSpec extends AnyFlatSpec with should.Matchers{

  behavior of "Sender"

  it should "add header to message" in {
    val sender = Sender("header")
    val actual = sender.send("message")
    val expected = "header\nmessage"

    actual shouldBe expected
  }
}
