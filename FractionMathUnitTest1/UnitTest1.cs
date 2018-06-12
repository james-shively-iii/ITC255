using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using FractionMath;


namespace FractionMathUnitTest1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestSubtraction()
        {
            Fraction f1 = new Fraction("1/8");
            Fraction f2 = new Fraction("2/3");
            Fraction f3 = f1 - f2;
            Assert.AreEqual(f3.ToString(), "-13/24");
        }
        [TestMethod]
        public void TestDivision()
        {
            Fraction f1 = new Fraction("1/8");
            Fraction f2 = new Fraction("2/3");
            Fraction f3 = f1 / f2;
            Assert.AreEqual(f3.ToString(), "3/16");
        }
        [TestMethod]
        public void TestAddition()
        {
            Fraction f1 = new Fraction("1/8");
            Fraction f2 = new Fraction("2/3");
            Fraction f3 = f1 + f2;
            Assert.AreEqual(f3.ToString(), "19/24");
        }
        [TestMethod]
        public void TestMultiplication()
        {
            Fraction f1 = new Fraction("1/8");
            Fraction f2 = new Fraction("2/3");
            Fraction f3 = f1 * f2;
            Assert.AreEqual(f3.ToString(), "1/12");
        }
        [TestMethod]
        public void TestComparitive()
        {
            Fraction f1 = new Fraction("1/3");
            Fraction f2 = new Fraction("1/4");

            Assert.IsTrue(f1 > f2);
        }
    }
}
