object Solution {
  def solve(prices: Array[Int], idx: Int = 0, minsofar: Int = Int.MaxValue, maxsofar: Int = 0): Int = {
    if (idx < prices.length) {
      val newminsofar = math.min(minsofar, prices(idx))
      val newmaxsofar = math.max(maxsofar, prices(idx) - newminsofar)

      solve(prices, idx + 1, newminsofar, newmaxsofar)
    } else maxsofar
  }

  def maxProfit(prices: Array[Int]): Int = {
    solve(prices)
  }

  def main(args: Array[String]): Unit = {
    val prices = Array(7, 1, 5, 3, 6, 4)
    val result = maxProfit(prices)
    println(s"Maximum profit: $result")
  }
}
