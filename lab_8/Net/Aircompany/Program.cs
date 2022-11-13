using Aircompany.Models;
using Aircompany.Planes;
using System;
using System.Collections.Generic;

namespace Aircompany
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Airport airport = new Airport(PlanesList.Planes);
            Airport militaryAirport = new Airport(airport.GetMilitaryPlanes());
            Airport passengerAirport = new Airport(airport.GetPassengersPlanes());
            Console.WriteLine(militaryAirport
                              .SortPlanesByMaxFlightDistance()
                              .ToString());
            Console.WriteLine(passengerAirport
                              .SortPlanesByMaxSpeed()
                              .ToString());
            Console.WriteLine(passengerAirport.GetPassengerPlaneWithMaxPassengersCapacity());
        }
    };
       
    }

