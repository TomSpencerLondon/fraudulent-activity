# Fraudulent Activity Notifications

## Overview
This repository contains a solution for the *Fraudulent Activity Notifications* challenge. The goal is to demonstrate a structured approach to problem-solving, emphasizing the thought process, steps taken, and the rationale behind decisions. The focus is not solely on the final answer but on showcasing a unique approach and the learning journey.

---

## Problem Statement
Given a list of daily expenditures, calculate the total number of notifications sent for all expenditures that exceed twice the mean of the previous `d` days.

---

## Assumptions
- Calculating the mean is a solved problem.
- The size of the withdrawals is limited.
- Withdrawals are always non-negative.
- The amount of withdrawals evaluated can be very large.
- Performance is critical due to potentially large data sets.

---

## Steps Taken
1. **Decomposed the problem** into two smaller problems:
    - Efficiently calculating the mean.
    - Using a sliding window approach to manage the previous `d` days' data.

2. **Implemented sliding window logic**:
    - Created an initial count array for the first `d` days.
    - For each new day:
        - Subtracted 1 from the count for the element that falls out of the window (`i - d`).
        - Added 1 to the count for the new element (`i`).
    - Checked the mean using the count array for the current `d` days.
    - Incremented the notification count if the expenditure exceeded twice the mean.

3. **Returned the total notification count** as the final result.

---

## Challenges and Solutions
### Performance Optimization
- **Challenge**: Ensuring the solution is efficient for large data sets.
- **Solution**:
    - Used a count array to track frequencies of expenditures.
    - Avoided sorting the expenditure array, reducing time complexity from `O(n log n)` to `O(n)`.

### Visualizing Edge Cases
- **Challenge**: Handling large data sets and edge cases.
- **Solution**:
    - Ran code locally with test data.
    - Identified errors using the status of `d` (even or odd).
    - Fixed calculation logic for even cases by using precise decimal values, ensuring accuracy and avoiding rounding errors.

---

## Alternative Approaches
1. **Heap-based Approach**:
    - Efficient for calculating the median with operations like insertion and deletion (`O(log n)` each).
    - Accessing the top element is `O(1)`.
    - **Reason for rejection**:
        - Overhead and complexity were not justified for this problem.
        - Memory and processing requirements were higher compared to the count array approach.

2. **Count Array**:
    - Opted for the count array due to its simplicity and efficiency.
    - Suitable for the limited range of withdrawals in the problem.

---

## Conclusion
The solution employs a sliding window technique with a count array for optimized performance. This approach ensures efficiency, accuracy, and scalability while avoiding unnecessary complexity. By focusing on the thought process, challenges, and alternative approaches, this project highlights the importance of structured problem-solving in technical challenges.
