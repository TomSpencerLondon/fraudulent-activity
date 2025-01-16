# Fraudulent Activity Notifications

## Overview
This repository contains a solution for the [Fraudulent Activity Notifications - HackerRank](https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem)
challenge. The goal is to demonstrate a structured approach to problem-solving, emphasizing the thought process, steps taken, and the rationale behind decisions. The focus is not solely on the final answer but on showcasing a unique approach and the learning journey.

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
    - **Reason for selection**:
        - Provided a balance between performance and simplicity.
        - Reduced complexity and memory overhead compared to other approaches.

---

## Conclusion
This solution effectively leverages a sliding window technique combined with a count array to deliver an optimized, scalable, and efficient approach to solving the problem. By minimizing complexity and addressing performance bottlenecks, it demonstrates a pragmatic balance between computational efficiency and implementation simplicity.

Through a structured exploration of thought processes, challenges, and alternative approaches, this project not only provides a robust solution but also highlights the importance of critical thinking, adaptability, and precision in technical problem-solving. This methodology serves as a valuable blueprint for tackling similar algorithmic challenges.

---