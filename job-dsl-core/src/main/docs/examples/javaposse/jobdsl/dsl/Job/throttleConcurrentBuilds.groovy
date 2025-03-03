// throttle one job on its own
job('example-1') {
    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(2)
    }
}

// throttle as part of a category
job('example-2') {
    throttleConcurrentBuilds {
        categories(['cat-1'])
    }
}

// throttle to one job with same parameters
job('example-3') {
    throttleConcurrentBuilds {
        throttleOneJobWithMatchingParams()
    }
}
