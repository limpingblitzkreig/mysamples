<html>
<!-- Copyright (c) 2011, Subbu (Subrahmanyam) Devulapalli. All rights reserved. -->
<head>
<title>OES examples: login page</title>
</head>
<body bgcolor="#ffffff">
	<blockquote>
		<h2>Please enter user name (e.g. weblogic) and password (e.g.
			welcome1):</h2>
		<p>
		<form method="POST" action="j_security_check">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="j_username">
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="j_password">
					</td>
				</tr>
				<tr>
					<td colspan=2 align=right><input type=submit value="Submit">
					</td>
				</tr>
			</table>
		</form>
	</blockquote>
</body>
</html>
