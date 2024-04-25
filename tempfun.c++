#include<iostream>
using namespace std;

// Template function for addition
template <typename Digit>
Digit add(Digit num1, Digit num2)
{
    return num1 + num2;
}

// Template class
template <typename TempData>
class Report
{
    TempData value;
public:
    Report(TempData num1)
    {
        value = num1;
    }
    void displayValue()
    {
        cout << "The value is " << value << endl;
    }
};

int main()
{
    // Using the template function with different types
    int intResult = add(5, 7);
    float floatResult = add(3.14, 2.718);

    cout << "The sum of the integer values: " << intResult << endl;
    cout << "The sum of the floating-point values: " << floatResult << endl;

    // Using the template class with different types
    Report<int> obj(10);
    Report<double> obj2(3.14159);

    obj.displayValue();
    obj2.displayValue();

    return 0;
}
