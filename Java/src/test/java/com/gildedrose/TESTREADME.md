# Test Strategy for Gilded Rose (Java)
This repository contains a suite of characterization tests for the legacy implementation of the Gilded Rose kata. The goal was to build a robust test foundation to support future refactoring efforts without changing existing behavior.

## Test Goals
Ensure all current item types are covered: normal items, Aged Brie, Sulfuras, Backstage Passes.

Validate both typical and edge behavior (e.g. max/min quality, expired items).

Reproduce and document the current (even buggy) behavior of the system.

Use meaningful, self-descriptive test names for maintainability.

Avoid modifying the legacy code until the test suite fully covers its logic.

## Implemented Tests
### Normal item degrades by 1 before expiration

### Normal item quality never goes below 0

### Normal item degrades by 2 after expiration

### Aged Brie increases in quality

### Aged Brie never exceeds max quality of 50

### Sulfuras never changes in sellIn or quality

### Backstage passes increase in quality:

#### by 1 if sellIn > 10

#### by 2 if 6 ≤ sellIn ≤ 10

#### by 3 if 1 ≤ sellIn ≤ 5

#### drop to 0 if sellIn ≤ 0

# Known Gaps / Challenges
Conjured items are included in the codebase but not implemented correctly.
According to the Gilded Rose requirements, they should degrade twice as fast as normal items.
## This is a great candidate for a failing test and future implementation.

The legacy code is difficult to understand and modify due to nested if statements and hard-coded item name logic. Tests help protect behavior before refactoring.

