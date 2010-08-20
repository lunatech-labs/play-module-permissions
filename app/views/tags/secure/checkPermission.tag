#{if session.username && controllers.Secure.checkPermission(_target, _permission)}
    #{doBody /}
#{/if}