; CreateCylinder Example
; ----------------------

Graphics3D 640,480
SetBuffer BackBuffer()

camera=CreateCamera()

light=CreateLight()
RotateEntity light,90,0,0

; Create cylinder
cylinder=CreateCylinder()

PositionEntity cylinder,0,0,5

While Not KeyDown( 1 )
	RenderWorld
	Flip
Wend

End