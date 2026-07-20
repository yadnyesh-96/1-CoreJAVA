


public class InsertionAPP{
	public static void main(String x[]){
		int a[] = new int[]{1,2,3};
		int b[] = new int[]{2,3,4};
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					System.out.println(a[i]+" ");
					break;
				}
			}
		}
	}
}













GOAL : Start the 3-Phase Water Pump health Safely via 3-phase Contractor 

we have three maijor parts/components 
 > Master Switch (Decides controlling which one handles either "Jaltantra Smart COntroller" or "Dharti Auto Switch")
 - these switch decide by the user on side as per user decision if his push button on Dharti then working on dharti controller wither jalatantra.
 
 if "Jaltantra Smart Controller"
	Then Jaltantra has Three Modes 
	1. AUTO 
	2. MANUAL
	3. BYPASS 
	These controllers are available on virtually in Mobile application or web server 
	recommended on mobile app better UI UX 
	AI scheduling suggestion etc.,
	Note : Before set any mode Controller should be checks first Electricity Health of 3 Phase if All Phases are okay then.
	1.AUTO : Before set-up automode condition should be health of all pahase healthly then start pump as per auto or scheduled shcedule.
	2.MANUAL : manual mode is to ensure that note perform any operation mode is in ideal state or dormant mode. it also check electric phase health 
	3.BYPASS : bypass is allows to us (user) it will be indepent to select the either motor pump ON or OFF as per the required Manually ON via application or cloud as per jalatantra smart controller allows then pump will be act as per 
	
 if "Dharti Auto Switch" 
	they should be work as per their functionality 
	what ever they contains we have not interference over their logic 
	
	we only work on our Jaltantra 
	and Jalatantra will be not tergere in Dharti Auto Switch 
	if when the Jalatantra Smart COntroller Fails then disconnect the connection with contractor and notify the user and turn Off the Pump safely and if possible then identify the error or notify user is possible to solve then user will be solved if not then Jaltantra team work on it 
	
	in these case if Electric supply has be fault in any condition and it will be we have ensure one led as a indiactor in on site phycially spot on Jalatantra pcb 
	and indicator on Virtual app which indicated the user supply has faulty and one LCD as well whcih describe short breif summary etc displays on site ...
	
	


   Client / HR Team
       │
       ▼
Upload Input Files
(Employee Details,
Salary Details,
Timesheet,
ShiftMaster,
HolidayMaster)
to Shared Folder
       │
       ▼
AutomationEdge Scheduler
Triggers Workflow
       │
       ▼
Read Input Files
       │
       ▼
Validate Input Data
(Employee ID,
Shift Code,
Date Format,
Time Format,
Null Values)
       │
       ├──────────── Invalid Data Found ────────────┐
       │                                            │
       ▼                                            ▼
Valid Data                                    Invalid Data
       │                                     Exception File
       │                                            │
       ▼                                            ▼
Calculate Working Hours                 Send Email Notification
       │                               OR Save Exception Report
       ▼                                            │
Calculate LWP                                      End
       │
       ▼
Calculate Salary Components
(DA, HRA, PF)
       │
       ▼
Calculate Shift Allowance
       │
       ▼
Calculate Weekend Allowance
       │
       ▼
Calculate Holiday Bonus
       │
       ▼
Calculate Net Salary
       │
       ▼
Generate Salary Report
       │
       ▼
Generate Attendance Report
       │
       ▼
Save Output Files
(Output Folder)
       │
       ▼
Send Report via Email
       │
       ▼
Process Completed







Yes. I can provide the Java solutions.

The test paper contains **10 questions**, and the instructions say **"Solve any 10 questions."** 

Since all 10 solutions are too large for a single response, I suggest we solve them **one by one** with:

* ✅ Proper indentation
* ✅ Comments
* ✅ User input using `Scanner`
* ✅ No unnecessary inbuilt methods (as mentioned in the paper)
* ✅ Interview-level explanation
* ✅ Time Complexity (where applicable)

---

# Q1. Pattern Program

### Output

```
1
2 2
3 3
4 4
5 5
4 4
3 3
2 2
1
```

### Java Program

```java
import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Upper Half
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 2; j++) {

                if (i == 1) {
                    System.out.print(i);
                    break;
                }

                System.out.print(i + " ");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= 2; j++) {

                if (i == 1) {
                    System.out.print(i);
                    break;
                }

                System.out.print(i + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
```

---

# Q2. Queue Using Array (Remove All Occurrences)

### Java Program

```java
import java.util.Scanner;

public class QueueRemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        int queue[] = new int[n];

        System.out.println("Enter queue elements:");

        for (int i = 0; i < n; i++) {
            queue[i] = sc.nextInt();
        }

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();

        System.out.println("Queue after removing:");

        for (int i = 0; i < n; i++) {

            if (queue[i] != remove) {
                System.out.print(queue[i] + " ");
            }
        }

        sc.close();
    }
}
```

---

# Q3. PrimeArrayManager

```java
import java.util.Scanner;

class PrimeArrayManager {

    int arr[];

    PrimeArrayManager(int arr[]) {
        this.arr = arr;
    }

    boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public void process() {

        int prime[] = new int[arr.length];
        int nonPrime[] = new int[arr.length];

        int p = 0;
        int np = 0;

        // Separate Prime and Non Prime

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                prime[p++] = arr[i];
            } else {
                nonPrime[np++] = arr[i];
            }
        }

        // Sort Prime Ascending

        for (int i = 0; i < p - 1; i++) {

            for (int j = 0; j < p - i - 1; j++) {

                if (prime[j] > prime[j + 1]) {

                    int temp = prime[j];
                    prime[j] = prime[j + 1];
                    prime[j + 1] = temp;
                }
            }
        }

        // Sort Non Prime Descending

        for (int i = 0; i < np - 1; i++) {

            for (int j = 0; j < np - i - 1; j++) {

                if (nonPrime[j] < nonPrime[j + 1]) {

                    int temp = nonPrime[j];
                    nonPrime[j] = nonPrime[j + 1];
                    nonPrime[j + 1] = temp;
                }
            }
        }

        System.out.print("Prime Numbers : ");

        for (int i = 0; i < p; i++)
            System.out.print(prime[i] + " ");

        System.out.println();

        System.out.print("Non Prime Numbers : ");

        for (int i = 0; i < np; i++)
            System.out.print(nonPrime[i] + " ");

        System.out.println();

        System.out.print("Final Array : ");

        for (int i = 0; i < p; i++)
            System.out.print(prime[i] + " ");

        for (int i = 0; i < np; i++)
            System.out.print(nonPrime[i] + " ");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        PrimeArrayManager obj = new PrimeArrayManager(arr);

        obj.process();

        sc.close();
    }
}
```

---

These are the solutions for **Q1, Q2, and Q3** from your test paper. 

I can also provide the remaining **Q4–Q10** (HashMap, Threads, Exception Handling, ArrayList, etc.) in the same clean, interview-ready format.


Yes. I can provide the Java solutions.

The test paper contains **10 questions**, and the instructions say **"Solve any 10 questions."** 

Since all 10 solutions are too large for a single response, I suggest we solve them **one by one** with:

* ✅ Proper indentation
* ✅ Comments
* ✅ User input using `Scanner`
* ✅ No unnecessary inbuilt methods (as mentioned in the paper)
* ✅ Interview-level explanation
* ✅ Time Complexity (where applicable)

---

# Q1. Pattern Program

### Output

```
1
2 2
3 3
4 4
5 5
4 4
3 3
2 2
1
```

### Java Program

```java
import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Upper Half
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 2; j++) {

                if (i == 1) {
                    System.out.print(i);
                    break;
                }

                System.out.print(i + " ");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= 2; j++) {

                if (i == 1) {
                    System.out.print(i);
                    break;
                }

                System.out.print(i + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
```

---

# Q2. Queue Using Array (Remove All Occurrences)

### Java Program

```java
import java.util.Scanner;

public class QueueRemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        int queue[] = new int[n];

        System.out.println("Enter queue elements:");

        for (int i = 0; i < n; i++) {
            queue[i] = sc.nextInt();
        }

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();

        System.out.println("Queue after removing:");

        for (int i = 0; i < n; i++) {

            if (queue[i] != remove) {
                System.out.print(queue[i] + " ");
            }
        }

        sc.close();
    }
}
```

---

# Q3. PrimeArrayManager

```java
import java.util.Scanner;

class PrimeArrayManager {

    int arr[];

    PrimeArrayManager(int arr[]) {
        this.arr = arr;
    }

    boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public void process() {

        int prime[] = new int[arr.length];
        int nonPrime[] = new int[arr.length];

        int p = 0;
        int np = 0;

        // Separate Prime and Non Prime

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                prime[p++] = arr[i];
            } else {
                nonPrime[np++] = arr[i];
            }
        }

        // Sort Prime Ascending

        for (int i = 0; i < p - 1; i++) {

            for (int j = 0; j < p - i - 1; j++) {

                if (prime[j] > prime[j + 1]) {

                    int temp = prime[j];
                    prime[j] = prime[j + 1];
                    prime[j + 1] = temp;
                }
            }
        }

        // Sort Non Prime Descending

        for (int i = 0; i < np - 1; i++) {

            for (int j = 0; j < np - i - 1; j++) {

                if (nonPrime[j] < nonPrime[j + 1]) {

                    int temp = nonPrime[j];
                    nonPrime[j] = nonPrime[j + 1];
                    nonPrime[j + 1] = temp;
                }
            }
        }

        System.out.print("Prime Numbers : ");

        for (int i = 0; i < p; i++)
            System.out.print(prime[i] + " ");

        System.out.println();

        System.out.print("Non Prime Numbers : ");

        for (int i = 0; i < np; i++)
            System.out.print(nonPrime[i] + " ");

        System.out.println();

        System.out.print("Final Array : ");

        for (int i = 0; i < p; i++)
            System.out.print(prime[i] + " ");

        for (int i = 0; i < np; i++)
            System.out.print(nonPrime[i] + " ");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        PrimeArrayManager obj = new PrimeArrayManager(arr);

        obj.process();

        sc.close();
    }
}
```

---

These are the solutions for **Q1, Q2, and Q3** from your test paper. 

I can also provide the remaining **Q4–Q10** (HashMap, Threads, Exception Handling, ArrayList, etc.) in the same clean, interview-ready format.
