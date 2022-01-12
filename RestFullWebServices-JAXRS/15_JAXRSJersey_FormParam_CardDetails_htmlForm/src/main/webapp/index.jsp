<html>
<body>
	<h2>Payment Screen is Here!</h2>
	<!-- Full URL: http://localhost:2020/Jersey2FormParamProducer/rest/payment/card -->
	<form action="rest/payment/card" method="POST">
		<pre>
CARD NUMBER     : <input type="text" name="cnum"
				placeholder="xxxx-xxxx-xxxx-xxxx" />
CARD HOLDER NAME: <input type="text" name="cname" placeholder="ABCDEF" />
EXP MONTH       : <select name="expMonth">
             <option>JAN</option>
             <option>FEB</option>
             <option>MAR</option>
             <option>APR</option>
             <option>MAY</option>
             <option>JUN</option>
             <option>JUL</option>
             <option>AUG</option>
             <option>SEP</option>
             <option>OCT</option>
             <option>NOV</option>
             <option>DEC</option>
   </select>
EXP YEAR        : <select name="expYear">
             <option>2020</option>
             <option>2021</option>
             <option>2022</option>
             <option>2023</option>
             <option>2024</option>
             <option>2026</option>
             <option>2027</option>
             <option>2028</option>
   </select>   
CVV             : <input type="password" name="cvv" placeholder="***" />
AMOUNT          : <input type="text" name="amt" placeholder="123.123" />
    <input type="submit" value="Pay Now.." />                    
</pre>
	</form>
</body>
</html>
