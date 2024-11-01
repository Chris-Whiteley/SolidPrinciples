package com.cwsoft.solid.isp;
/**
 * The "I" in SOLID stands for Interface Segregation Principle (ISP).
 *
 * Definition:
 * The Interface Segregation Principle states that no client should be forced to depend on methods it does
 * not use. In other words, large, general-purpose interfaces should be divided into smaller, more specific
 * ones, so that clients only need to know about the methods that are relevant to them.
 *
 * Why is it important?
 * It helps to avoid "fat interfaces"—interfaces that contain methods irrelevant to some or all of the
 * classes that implement them.
 * It makes the system more flexible and easier to maintain. Changes to one part of the system won’t
 * force unrelated classes to be modified, as they only depend on what they need.
 * It encourages cohesion, making interfaces more focused and meaningful.
 */
