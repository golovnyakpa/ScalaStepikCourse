def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
  import math._
  pow(E, -pow(x-mu, 2)/(2*pow(sigma, 2)))/(sigma*sqrt(2*Pi))
}