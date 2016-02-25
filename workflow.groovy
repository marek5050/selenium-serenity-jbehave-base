when 'Open', {
    'success' should: 'Resolve Issue'
}

when 'Open', {
    'success' should: 'Resolve'
}

when 'Open', {
    'failure' should: 'Resolve'
}

when 'Reopened', {
    'success' should: 'Resolve Issue'
}

when 'Resolved', {
    'failure' should: 'Reopen Issue'
}

when 'In Progress', {
    'success' should: ['Stop Progress','Resolve Issue']
}

when 'CLOSED', {
    'failure' should: 'Reopen'
}

when 'CLOSED', {
    'success' should: 'Reopen'
}
